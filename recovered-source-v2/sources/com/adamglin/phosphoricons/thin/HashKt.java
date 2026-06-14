package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HashKt {
    private static ImageVector _hash;

    public static final ImageVector getHash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _hash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 92.0f);
        pathBuilder.lineTo(170.61f, 92.0f);
        pathBuilder.lineToRelative(9.33f, -51.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.88f, -1.44f);
        pathBuilder.lineTo(162.48f, 92.0f);
        pathBuilder.lineTo(106.61f, 92.0f);
        pathBuilder.lineToRelative(9.33f, -51.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.88f, -1.44f);
        pathBuilder.lineTo(98.48f, 92.0f);
        pathBuilder.lineTo(48.0f, 92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(97.0f, 100.0f);
        pathBuilder.lineTo(86.84f, 156.0f);
        pathBuilder.lineTo(32.0f, 156.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(85.39f, 164.0f);
        pathBuilder.lineToRelative(-9.33f, 51.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.22f, 4.65f);
        pathBuilder.arcTo(3.65f, 3.65f, 0.0f, false, false, 80.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.94f, -3.29f);
        pathBuilder.lineTo(93.52f, 164.0f);
        pathBuilder.horizontalLineToRelative(55.87f);
        pathBuilder.lineToRelative(-9.33f, 51.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.22f, 4.65f);
        pathBuilder.arcToRelative(3.65f, 3.65f, 0.0f, false, false, 0.72f, 0.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.94f, -3.29f);
        pathBuilder.lineTo(157.52f, 164.0f);
        pathBuilder.lineTo(208.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(159.0f, 156.0f);
        pathBuilder.lineToRelative(10.19f, -56.0f);
        pathBuilder.lineTo(224.0f, 100.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(150.84f, 156.0f);
        pathBuilder.lineTo(95.0f, 156.0f);
        pathBuilder.lineToRelative(10.19f, -56.0f);
        pathBuilder.lineTo(161.0f, 100.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
