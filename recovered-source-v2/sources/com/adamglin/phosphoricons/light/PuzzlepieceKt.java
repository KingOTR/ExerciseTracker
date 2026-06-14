package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Puzzlepiece.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PuzzlePiece", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPuzzlePiece", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_puzzlePiece", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PuzzlepieceKt {
    private static ImageVector _puzzlePiece;

    public static final ImageVector getPuzzlePiece(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _puzzlePiece;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PuzzlePiece", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(219.21f, 160.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.78f, -0.35f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, true, -11.05f, -41.83f);
        pathBuilder.arcToRelative(22.15f, 22.15f, 0.0f, false, true, 11.05f, 2.06f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 222.0f, 114.7f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f);
        pathBuilder.horizontalLineTo(169.48f);
        pathBuilder.arcToRelative(35.0f, 35.0f, 0.0f, false, false, 0.52f, -6.0f);
        pathBuilder.arcToRelative(34.1f, 34.1f, 0.0f, false, false, -10.73f, -24.78f);
        pathBuilder.arcToRelative(33.64f, 33.64f, 0.0f, false, false, -25.45f, -9.15f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, false, 102.54f, 58.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 72.0f);
        pathBuilder.verticalLineToRelative(34.53f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, -30.79f, 10.2f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, 22.31f, 57.18f);
        pathBuilder.arcToRelative(34.34f, 34.34f, 0.0f, false, false, 8.48f, -0.44f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.verticalLineTo(165.31f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 219.21f, 160.24f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 208.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(165.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.arcToRelative(5.92f, 5.92f, 0.0f, false, false, -2.57f, 0.58f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, -31.38f, -18.46f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, 31.38f, -21.31f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 62.0f, 114.7f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(46.69f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.42f, -8.57f);
        pathBuilder.arcToRelative(22.25f, 22.25f, 0.0f, false, true, -2.0f, -11.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, true, 41.83f, 11.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 161.3f, 70.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(34.54f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, -39.93f, 31.28f);
        pathBuilder.arcToRelative(33.71f, 33.71f, 0.0f, false, false, 9.14f, 25.45f);
        pathBuilder.arcTo(34.15f, 34.15f, 0.0f, false, false, 210.0f, 173.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _puzzlePiece = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
