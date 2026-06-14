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

/* compiled from: Starofdavid.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarOfDavid", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getStarOfDavid", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starOfDavid", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarofdavidKt {
    private static ImageVector _starOfDavid;

    public static final ImageVector getStarOfDavid(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _starOfDavid;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("StarOfDavid", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(196.61f, 128.0f);
        pathBuilder.lineToRelative(30.86f, -54.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 68.0f);
        pathBuilder.lineTo(162.33f, 68.0f);
        pathBuilder.lineTo(131.47f, 14.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.94f, 0.0f);
        pathBuilder.lineTo(93.66f, 68.0f);
        pathBuilder.lineTo(32.0f, 68.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.47f, 6.0f);
        pathBuilder.lineToRelative(30.85f, 54.0f);
        pathBuilder.lineTo(28.53f, 182.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 188.0f);
        pathBuilder.lineTo(93.66f, 188.0f);
        pathBuilder.lineToRelative(30.87f, 54.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.94f, 0.0f);
        pathBuilder.lineToRelative(30.86f, -54.0f);
        pathBuilder.lineTo(224.0f, 188.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.47f, -6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(217.11f, 76.0f);
        pathBuilder.lineTo(192.0f, 119.94f);
        pathBuilder.lineTo(166.9f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(187.39f, 128.0f);
        pathBuilder.lineTo(157.69f, 180.0f);
        pathBuilder.lineTo(98.3f, 180.0f);
        pathBuilder.lineTo(68.59f, 128.0f);
        pathBuilder.lineTo(98.3f, 76.0f);
        pathBuilder.lineToRelative(59.39f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 24.06f);
        pathBuilder.lineToRelative(25.12f, 44.0f);
        pathBuilder.lineTo(102.87f, 68.06f);
        pathBuilder.close();
        pathBuilder.moveTo(38.89f, 76.0f);
        pathBuilder.lineTo(89.08f, 76.0f);
        pathBuilder.lineTo(64.0f, 119.94f);
        pathBuilder.close();
        pathBuilder.moveTo(38.89f, 179.92f);
        pathBuilder.lineTo(64.0f, 136.06f);
        pathBuilder.lineTo(89.08f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 231.92f);
        pathBuilder.lineTo(102.87f, 187.92f);
        pathBuilder.horizontalLineToRelative(50.25f);
        pathBuilder.close();
        pathBuilder.moveTo(166.9f, 180.0f);
        pathBuilder.lineTo(192.0f, 136.06f);
        pathBuilder.lineTo(217.11f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starOfDavid = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
