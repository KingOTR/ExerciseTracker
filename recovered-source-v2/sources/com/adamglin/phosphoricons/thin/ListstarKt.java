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

/* compiled from: Liststar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ListStar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getListStar", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_listStar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListstarKt {
    private static ImageVector _listStar;

    public static final ImageVector getListStar(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _listStar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ListStar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(36.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(216.0f, 60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(40.0f, 68.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 132.0f);
        pathBuilder.lineTo(96.0f, 132.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(40.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 188.0f);
        pathBuilder.lineTo(40.0f, 188.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.55f, 140.7f);
        pathBuilder.lineTo(210.09f, 160.89f);
        pathBuilder.lineTo(217.55f, 191.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.49f, 4.17f);
        pathBuilder.arcToRelative(4.06f, 4.06f, 0.0f, false, true, -2.4f, 0.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -0.55f);
        pathBuilder.lineTo(184.0f, 179.18f);
        pathBuilder.lineToRelative(-27.64f, 16.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.91f, -4.41f);
        pathBuilder.lineToRelative(7.46f, -30.15f);
        pathBuilder.lineTo(133.45f, 140.7f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.24f, -7.08f);
        pathBuilder.lineToRelative(32.24f, -2.49f);
        pathBuilder.lineToRelative(12.4f, -28.71f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.34f, 0.0f);
        pathBuilder.lineToRelative(12.4f, 28.71f);
        pathBuilder.lineToRelative(32.24f, 2.49f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.24f, 7.08f);
        pathBuilder.close();
        pathBuilder.moveTo(221.81f, 140.84f);
        pathBuilder.lineTo(197.0f, 138.92f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.36f, -2.4f);
        pathBuilder.lineTo(184.0f, 114.1f);
        pathBuilder.lineToRelative(-9.68f, 22.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.36f, 2.4f);
        pathBuilder.lineToRelative(-24.77f, 1.92f);
        pathBuilder.lineTo(165.0f, 156.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.33f, 4.0f);
        pathBuilder.lineToRelative(-5.78f, 23.36f);
        pathBuilder.lineTo(182.0f, 171.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.06f, 0.0f);
        pathBuilder.lineToRelative(21.47f, 12.64f);
        pathBuilder.lineToRelative(-5.78f, -23.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.33f, -4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _listStar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
