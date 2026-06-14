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

/* compiled from: Triangledashed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TriangleDashed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTriangleDashed", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_triangleDashed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriangledashedKt {
    private static ImageVector _triangleDashed;

    public static final ImageVector getTriangleDashed(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _triangleDashed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TriangleDashed", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(156.0f, 216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(104.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(233.34f, 190.09f);
        pathBuilder.lineTo(228.68f, 182.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.93f, 4.0f);
        pathBuilder.lineToRelative(4.65f, 8.08f);
        pathBuilder.arcToRelative(11.45f, 11.45f, 0.0f, false, true, 0.0f, 11.72f);
        pathBuilder.arcToRelative(12.47f, 12.47f, 0.0f, false, true, -10.94f, 6.2f);
        pathBuilder.lineTo(192.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(23.46f);
        pathBuilder.arcToRelative(20.36f, 20.36f, 0.0f, false, false, 17.86f, -10.2f);
        pathBuilder.arcTo(19.52f, 19.52f, 0.0f, false, false, 233.34f, 190.09f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 212.0f);
        pathBuilder.lineTo(40.54f, 212.0f);
        pathBuilder.arcToRelative(12.47f, 12.47f, 0.0f, false, true, -10.94f, -6.2f);
        pathBuilder.arcToRelative(11.45f, 11.45f, 0.0f, false, true, 0.0f, -11.72f);
        pathBuilder.lineTo(34.25f, 186.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.93f, -4.0f);
        pathBuilder.lineToRelative(-4.66f, 8.09f);
        pathBuilder.arcToRelative(19.52f, 19.52f, 0.0f, false, false, 0.0f, 19.71f);
        pathBuilder.arcTo(20.36f, 20.36f, 0.0f, false, false, 40.54f, 220.0f);
        pathBuilder.lineTo(64.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.18f, 148.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.47f, -6.0f);
        pathBuilder.lineToRelative(-23.0f, -40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.93f, 4.0f);
        pathBuilder.lineToRelative(23.0f, 40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 202.18f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(145.88f, 38.22f);
        pathBuilder.arcToRelative(20.75f, 20.75f, 0.0f, false, false, -35.76f, 0.0f);
        pathBuilder.lineTo(96.42f, 62.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.94f, 4.0f);
        pathBuilder.lineToRelative(13.69f, -23.79f);
        pathBuilder.arcToRelative(12.76f, 12.76f, 0.0f, false, true, 21.9f, 0.0f);
        pathBuilder.lineTo(152.64f, 66.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.94f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(78.88f, 100.53f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 73.39f, 102.0f);
        pathBuilder.lineToRelative(-23.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.94f, 4.0f);
        pathBuilder.lineToRelative(23.0f, -40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 78.85f, 100.53f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _triangleDashed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
